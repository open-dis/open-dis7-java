package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@433defed;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16158
 */
public class F792PremierMaitreLher extends EntityType
{
    /** Default constructor */
    public F792PremierMaitreLher()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)1); // uid 16146, Destienne Dorves (Type A 69) class
        setSpecific((byte)12); // uid 16158, F 792 Premier Maitre Lher
    }
}
