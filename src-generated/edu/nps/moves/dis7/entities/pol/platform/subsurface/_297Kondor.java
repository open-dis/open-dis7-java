package edu.nps.moves.dis7.entities.pol.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cc20577;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23044
 */
public class _297Kondor extends EntityType
{
    /** Default constructor */
    public _297Kondor()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23037, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23040, Sokol Class
        setSpecific((byte)4); // uid 23044, 297 Kondor
    }
}
