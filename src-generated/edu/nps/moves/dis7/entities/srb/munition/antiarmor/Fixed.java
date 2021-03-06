package edu.nps.moves.dis7.entities.srb.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5a85b4e6;
 * Country: Serbia (SRB);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 30181
 */
public class Fixed extends EntityType
{
    /** Default constructor */
    public Fixed()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)3); // uid 30181, Fixed
    }
}
