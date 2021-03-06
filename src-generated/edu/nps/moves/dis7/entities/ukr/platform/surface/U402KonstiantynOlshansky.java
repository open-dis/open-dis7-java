package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ba46e63;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27855
 */
public class U402KonstiantynOlshansky extends EntityType
{
    /** Default constructor */
    public U402KonstiantynOlshansky()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 27853, Tank Landing Ship
        setSubCategory((byte)1); // uid 27854, Ropucha Class
        setSpecific((byte)1); // uid 27855, U-402 Konstiantyn Olshansky
    }
}
