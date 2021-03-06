package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f9e1534;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23075
 */
public class _641Druzno extends EntityType
{
    /** Default constructor */
    public _641Druzno()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23062, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23063, Goplo (Notec) Class
        setSpecific((byte)12); // uid 23075, 641 Druzno
    }
}
