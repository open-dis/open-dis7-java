package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29e6eb25;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24460
 */
public class EcoEuropa extends EntityType
{
    /** Default constructor */
    public EcoEuropa()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24458, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24459, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24460, Eco Europa
    }
}
