package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@793f29ff;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16013
 */
public class L9011Foudre extends EntityType
{
    /** Default constructor */
    public L9011Foudre()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 16011, Dock Landing Ship
        setSubCategory((byte)1); // uid 16012, Foudre class (Type TCD 90)
        setSpecific((byte)1); // uid 16013, L 9011 Foudre
    }
}
