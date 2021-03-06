package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4044fb95;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18342
 */
public class CassiopeaClassOffshorePatrolVesselsOPV extends EntityType
{
    /** Default constructor */
    public CassiopeaClassOffshorePatrolVesselsOPV()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18341, Light/Patrol Craft
        setSubCategory((byte)1); // uid 18342, Cassiopea Class (Offshore Patrol Vessels) (OPV)
    }
}
