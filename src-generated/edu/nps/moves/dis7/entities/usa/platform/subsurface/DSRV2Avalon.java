package edu.nps.moves.dis7.entities.usa.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@57bd6a8f;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22951
 */
public class DSRV2Avalon extends EntityType
{
    /** Default constructor */
    public DSRV2Avalon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 12410, SSA(Conventional Auxiliary)
        setSubCategory((byte)3); // uid 22949, Deep Submergence Rescue Vehicle (DSRV)
        setSpecific((byte)2); // uid 22951, DSRV-2 Avalon
    }
}
