package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a1c3cb4;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27480
 */
public class A579CezayirliGaziHasanPasa extends EntityType
{
    /** Default constructor */
    public A579CezayirliGaziHasanPasa()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27478, Auxiliary
        setSubCategory((byte)1); // uid 27479, Rhein Class (Type 401, Tender)
        setSpecific((byte)1); // uid 27480, A-579 Cezayirli Gazi Hasan Pasa
    }
}
